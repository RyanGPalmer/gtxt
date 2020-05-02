package com.vc.model

import java.io.File

class GtxtEditor(val title: String = "Untitled", val lines: String = "") {
	constructor(file: File) : this(file.name, collateLines(file.readLines()))

	
}

private fun collateLines(lines: List<String>): String {
	val result = StringBuilder()
	for (line in lines) result.appendln(line)
	return result.toString()
}