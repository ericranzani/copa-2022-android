package me.dio.copa.catar.core

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.*
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import me.dio.copa.catar.notification.scheduler.extensions.showNotification

import java.util.concurrent.TimeUnit

@HiltWorker
class MatchNotifier @AssistedInject constructor (
      @Assisted private val context: Context,
      @Assisted private val workerParams: WorkerParameters

) : Worker(context, workerParams) {
     override fun doWork(): Result {

         val title = inputData.getString(NOTIFICATION_TITLE)
         val content = inputData.getString(NOTIFICATION_CONTENT)

        context.showNotification(
            title = title ?: "",
            content = content ?: ""
        )

        return Result.success()
    }

    companion object {
        private const val NOTIFICATION_WORKER = "notification_worker"
        private const val NOTIFICATION_TITLE = "notification_title"
        private const val NOTIFICATION_CONTENT = "notification_content"

        private val data = Data.Builder()

        fun start(context: Context, title: String, content: String) {

            data.putString(NOTIFICATION_TITLE, title)
            data.putString(NOTIFICATION_CONTENT, content)

            WorkManager.getInstance(context).enqueueUniqueWork(
                NOTIFICATION_WORKER,
                ExistingWorkPolicy.REPLACE,
                createRequest(data.build())
            )
        }

        private fun createRequest(data: Data) = OneTimeWorkRequestBuilder<MatchNotifier>()
            .setInputData(data)
            .setInitialDelay(5, TimeUnit.SECONDS)
            .build()

        fun cancel(context: Context) =
            WorkManager.getInstance(context).cancelUniqueWork(NOTIFICATION_WORKER)
    }
}