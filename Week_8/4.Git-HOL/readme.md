# Git Hands-On Lab: Merge Conflict Resolution

This repository contains the work I completed for the Git hands-on lab focused on resolving merge conflicts.

## Objective

The main goal of this hands-on lab was to learn how to handle and resolve a merge conflict in Git. 

This situation occurs when one user updates the main branch (master) in a way that conflicts with modifications made in a feature branch[cite: 4].

## Commands 

```bash
PS E:\gitDemo4> git init
Initialized empty Git repository in E:/gitDemo4/.git/
PS E:\gitDemo4> echo "<message>Content from master branch</message>" > hello.xml
PS E:\gitDemo4> git add hello.xml
PS E:\gitDemo4> git commit -m "Initial commit on master"
[master (root-commit) 477447d] Initial commit on master
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 hello.xml
PS E:\gitDemo4> git checkout -b GitWork
Switched to a new branch 'GitWork'
PS E:\gitDemo4> echo "<message>Updated content in GitWork</message>" > hello.xml
PS E:\gitDemo4> git add hello.xml
PS E:\gitDemo4> git commit -m "Updated hello.xml in GitWork branch"
[GitWork 7c82c04] Updated hello.xml in GitWork branch
 1 file changed, 0 insertions(+), 0 deletions(-)
PS E:\gitDemo4> git checkout master
Switched to branch 'master'
PS E:\gitDemo4> echo "<message>A conflicting update from master</message>" > hello.xml
PS E:\gitDemo4> git add hello.xml
PS E:\gitDemo4> git commit -m "Conflicting update on master"
[master c983c03] Conflicting update on master
 1 file changed, 0 insertions(+), 0 deletions(-)
PS E:\gitDemo4> git merge GitWork
warning: Cannot merge binary files: hello.xml (HEAD vs. GitWork)
Auto-merging hello.xml
CONFLICT (content): Merge conflict in hello.xml
Automatic merge failed; fix conflicts and then commit the result.
PS E:\gitDemo4> cat hello.xml
<message>A conflicting update from master</message>
PS E:\gitDemo4> echo "<message>Final resolved content</message>" > hello.xml
PS E:\gitDemo4> git add hello.xml
PS E:\gitDemo4> git commit -m "Resolved merge conflict"
[master 4667d65] Resolved merge conflict
PS E:\gitDemo4> git branch -d GitWork
Deleted branch GitWork (was 7c82c04).
PS E:\gitDemo4> git log --oneline --graph --decorate
*   4667d65 (HEAD -> master) Resolved merge conflict
|\
| * 7c82c04 Updated hello.xml in GitWork branch
* | c983c03 Conflicting update on master
|/
* 477447d Initial commit on master
PS E:\gitDemo4>
```

## Screenshot of the Terminal 

![output](https://github.com/SudipSarkar1193/Digital-Nurture-4.0-JavaFSE/blob/main/Week8_Git/4.%20Git-HOL/Screenshot/Terminal_Screenshot.png?raw=true)