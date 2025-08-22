# Git Hands-On Lab 3: Branching and Merging

This assignment was all about learning the branching and merging workflow, which is one of the most powerful features of Git.

## Assignment Goal

The objective was to create a separate branch to work on a new "feature," and then merge that feature back into the main master branch once it was complete.

### Terminal

```bash
PS E:\> cd gitDemo3
PS E:\gitDemo3> git init
Initialized empty Git repository in E:/GitDemo3/.git/
PS E:\gitDemo3> echo "# My Project" > README.md
PS E:\gitDemo3> git add README.md
PS E:\gitDemo3> git commit -m "Initial commit"
[master (root-commit) e2ece3e] Initial commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.md
PS E:\gitDemo3> git branch GitNewBranch
PS E:\gitDemo3> git checkout GitNewBranch
Switched to branch 'GitNewBranch'
PS E:\gitDemo3> echo "This is a new feature file." > feature.txt
PS E:\gitDemo3> git add feature.txt
PS E:\gitDemo3> git commit -m "Add feature file to new branch"
[GitNewBranch 162ee57] Add feature file to new branch
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 feature.txt
PS E:\gitDemo3> git checkout master
Switched to branch 'master'
PS E:\gitDemo3>
PS E:\gitDemo3> git diff GitNewBranch
diff --git a/feature.txt b/feature.txt
deleted file mode 100644
index dba1b06..0000000
Binary files a/feature.txt and /dev/null differ
PS E:\gitDemo3> git merge GitNewBranch
Updating e2ece3e..162ee57
Fast-forward
 feature.txt | Bin 0 -> 60 bytes
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 feature.txt
PS E:\gitDemo3> git log --oneline --graph --decorate
* 162ee57 (HEAD -> master, GitNewBranch) Add feature file to new branch
* e2ece3e Initial commit
PS E:\gitDemo3> git branch -d GitNewBranch
Deleted branch GitNewBranch (was 162ee57).
PS E:\gitDemo3> git status
On branch master
nothing to commit, working tree clean
PS E:\gitDemo3>
```

### Screenshot

![output](https://github.com/Sampreeth3217/CTS_JavaFSE_Deepskilling/blob/92a104c63bcf6aee66b24732a142db16dca8e203/Week_8/3.Git-HOL/image.png)
