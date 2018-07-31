package example

import org.ansj.splitWord.analysis.ToAnalysis

fun main(args: Array<String>) {
    val str = "欢迎使用ansj_seg,(ansj中文分词)在这里如果你遇到什么问题都可以联系我.我一定尽我所能.帮助大家.ansj_seg更快,更准,更自由!"
    val results = ToAnalysis.parse(str)
    println(results)
    println(results.map { it.name })
}
