# Git Hands-On Lab: GitDemo Project

This repository was created for my hands-on lab assignment on Git. The main goal was to practice the basic Git workflow.

### What I did in this assignment:

I followed the lab instructions to set up my Git environment and practice the fundamental commands. Here's a quick summary of what I learned and the steps I took:

- **Configured Git:** Set up my user.name and user.email.

- **Initialized a Repository:** Created this local repository using git init.

- **Created a File:** Added the welcome.txt file to the project.

- **Staged and Committed:** Used git add to stage the file and git commit to save it to my local repository.

- **Pushed to Remote Repository:** Used git push to upload the project from my computer to this remote repository on GitLab/GitHub.

### Commands 

```bash

PS D:\GitDemo> git --version
git version 2.45.0.windows.1
PS D:\GitDemo>
PS D:\GitDemo> git init
Initialized empty Git repository in D:/GitDemo/.git/
PS D:\GitDemo>
PS D:\GitDemo> echo "Welcome to GitDemo" > welcome.txt
PS D:\GitDemo>
PS D:\GitDemo> cat .\welcome.txt
Welcome to GitDemo
PS D:\GitDemo>
PS D:\GitDemo> git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        welcome.txt

nothing added to commit but untracked files present (use "git add" to track)
PS D:\GitDemo>
PS D:\GitDemo> git add .\welcome.txt
PS D:\GitDemo>
PS D:\GitDemo> git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   welcome.txt

PS D:\GitDemo> git commit -m "First commit for GitDemo"
[master (root-commit) f5b5b0a] First commit for GitDemo
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 welcome.txt
PS D:\GitDemo>
PS D:\GitDemo> git branch -M main
PS D:\GitDemo>
PS D:\GitDemo> git remote add origin https://github.com/Sampreeth3217/GitDemo.git
PS D:\GitDemo>
PS D:\GitDemo> git push -u origin main
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 271 bytes | 271.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Sampreeth3217/GitDemo.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
PS D:\GitDemo>

```

### Screenshot of the Remote Git Repository 

![output](https://github.com/Sampreeth3217/CTS_JavaFSE_Deepskilling/blob/master/Week_8/1.%20Git-HOL/Screenshots/cmd.png)

### Screenshot of the Terminal

![output](https://github.com/Sampreeth3217/CTS_JavaFSE_Deepskilling/blob/master/Week_8/1.%20Git-HOL/Screenshots/Repo.png)