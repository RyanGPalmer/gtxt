package com.vc

import com.vc.controller.GtxtEditorController
import com.vc.controller.GtxtFileController
import com.vc.controller.GtxtHelpController
import com.vc.controller.GtxtSettingsController
import com.vc.view.GtxtMainView
import tornadofx.App

class Gtxt : App(GtxtMainView::class) {
	override fun init() {
		GtxtEditorController()
		GtxtFileController()
		GtxtHelpController()
		GtxtSettingsController()
	}
}