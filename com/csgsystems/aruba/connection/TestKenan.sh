ID=`/usr/xpg4/bin/id -ur`
java TestKenan //`uname -n`:`expr ${ID} + 3000`

exit $?
