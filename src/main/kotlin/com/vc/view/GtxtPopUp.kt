package com.vc.view

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.stage.StageStyle
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox
import tornadofx.vboxConstraints

class GtxtPopUp(text: String) : Fragment(), () -> Unit {
	override val root = vbox(alignment = Pos.CENTER) {
		label(text) {
			vboxConstraints {
				margin = Insets(100.0)
			}
		}
	}

	override fun invoke() {
		openModal(StageStyle.UTILITY)
	}
}