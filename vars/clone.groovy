def call(String url, String branch) {

    echo "This is code cloning"

    git(
        url: url,
        branch: branch
    )

    echo "Code clone successful"
}
