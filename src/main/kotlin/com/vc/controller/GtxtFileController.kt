package com.vc.controller

import com.vc.event.GtxtNewEditorTabEvent
import com.vc.event.GtxtNewFileEvent
import com.vc.event.GtxtOpenFileEvent
import com.vc.event.GtxtSaveFileEvent
import com.vc.model.GtxtEditor
import com.vc.view.GtxtPopUp
import tornadofx.Controller
import tornadofx.chooseFile

class GtxtFileController : Controller() {
	init {
		subscribe<GtxtNewFileEvent> { newFile() }
		subscribe<GtxtOpenFileEvent> { openFile() }
		subscribe<GtxtSaveFileEvent> { openFile() }
	}

	private fun newFile() {
		fire(GtxtNewEditorTabEvent(GtxtEditor()))
	}

	private fun openFile() {
		fire(GtxtNewEditorTabEvent(GtxtEditor(chooseFile(filters = arrayOf()).first())))
	}

	private fun saveFile() {
		GtxtPopUp("Save File").invoke()
	}
}