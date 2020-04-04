#!/bin/sh

git config --global user.email "travis@travis-ci.org"
git config --global user.name "Travis CI"
git stash
v="$(git describe)"
version="${v#?}"
echo "Pushing readme for version $version"
git stash pop
git add README.md
git commit -m "Update readme for version $version"
git push https://${GH_TOKEN}@github.com/fs2-blobstore/fs2-blobstore