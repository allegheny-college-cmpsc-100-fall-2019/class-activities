# CMPSC 100-03 class activities repository

The professor will use this repository to distribute code to you for use during class activities during our regular M/W class sessions. At the instructor's direction, the class will perform various explorations of code to more thoroughly understand key course concepts.

Remember to save this folder in an easily-accessible and easy to remember location so that you can find it and work with its content quickly.

## Setup

After performing a successful `clone` operation, `cd` to the main directory of your copy of the repository and run the following command:

```
git remote add download git@https://github.com/allegheny-college-cmpsc-100-fall-2019/class-activities
```

This is a read-only repository, so you will not be able to `commit` against it. Here, we are adding the main repository as a `remote`, which is a location from which you can pull updates and changes.

## Updating

For subsequent class sessions, or when class content is added, simply run:

```
git pull download master
```

This will update content added to the repository since the last `clone` operation.