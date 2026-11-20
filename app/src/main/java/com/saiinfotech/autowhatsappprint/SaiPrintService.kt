package com.saiinfotech.autowhatsappprint

import android.print.PrintJob
import android.printservice.PrintService
import android.printservice.PrintServiceClient
import android.printservice.PrintService
import android.printservice.PrintJobInfo
import android.printservice.PrintDocument
import android.printservice.PrintDocumentInfo
import android.os.Handler
import android.os.Looper

class SaiPrintService : PrintService() {

    override fun onPrintJobQueued(printJob: PrintJob) {
        try {
            printJob.start()
            printJob.complete()
        } catch (e: Exception) {
            printJob.fail(e.message ?: "Print capture failed")
        }
    }

    override fun onRequestCancelPrintJob(printJob: PrintJob) {
        printJob.cancel()
    }
}
