package com.vc.view

import com.vc.event.*
import javafx.scene.control.TabPane
import javafx.scene.paint.Color
import tornadofx.*

class GtxtMainView : View() {
	override val root = borderpane {
		top = menubar {
			menu("File") {
				item("New").action { fire(GtxtNewFileEvent()) }
				item("Open").action { fire(GtxtOpenFileEvent()) }
				item("Save").action { fire(GtxtSaveFileEvent()) }
				separator()
				item("Settings").action { fire(GtxtSettingsEvent()) }
				separator()
				item("Exit").action { fire(GtxtExitEvent()) }
			}

			menu("Edit") {
				item("Copy").action { fire(GtxtCopyEvent()) }
				item("Paste").action { fire(GtxtPasteEvent()) }
			}

			menu("Help") {
				item("About").action { fire(GtxtAboutEvent()) }
			}

			style {
				backgroundColor += Color.YELLOW
			}
		}

		center = tabpane {
			style {
				backgroundColor += Color.BLUE
				setPrefSize(640.0, 480.0)
			}
		}
	}

	init {
		subscribe<GtxtExitEvent> { close() }
		subscribe<GtxtNewEditorTabEvent> {
			(root.center as TabPane).apply {
				tab(it.editor.title) {
					textarea(it.editor.lines)
				}
			}
		}
	}

	override fun onDock() {
		println("View docked")
	}

	override fun onUndock() {
		println("View removed")
	}
}