package cleanup

writer = new FileWriter("../../cleanup.txt")
writer.write("Not getting written")

new FileWriter("../../output.txt").withWriter {writer -> writer.write("Hello!")}//no need to close