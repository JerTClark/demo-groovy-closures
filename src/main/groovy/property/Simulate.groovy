package property

/**
 * In this example, an object will be obtained that has a closure as an
 * <b>instance property</b>
 */
def equipmentA = new Equipment({println "Calculator for closureParam$it"})
def closureParam = {println "Calculator predefined as closureParam$it"}
def equipmentB = new Equipment(closureParam, "B")
def equipmentC = new Equipment(closureParam, "C")
equipmentA.simulate()
equipmentB.simulate()
equipmentC.simulate()