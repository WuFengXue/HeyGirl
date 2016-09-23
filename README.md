# HeyGirl
Fork from BaiduSecurityLabs/ZjDroid.

# Reference
[BaiduSecurityLabs/ZjDroid](http://seclab.safe.baidu.com/opensec_detail_2.html)

[The ZjDroid Author Blog](http://blog.csdn.net/androidsecurity/article/details/38121585)

# Changes
Migrating the original project to Android Studio.
Changing the `com.zjdroid.invoke` action to `hey.girl`.

# Command

- Dump dex information

`am broadcast -a hey.girl --ei target [pid] --es cmd '{"action":"dump_dexinfo"}'`
 
- Dump dex classes

`am broadcast -a hey.girl --ei target [pid] --es cmd '{"action":"dump_class","dexpath":"*****"}'`
 
- Dump dex

`am broadcast -a hey.girl --ei target [pid] --es cmd '{"action":"dump_dexfile","dexpath":"*****"}'`
 
- Dump dex by baksmali

`am broadcast -a hey.girl --ei target [pid] --es cmd '{"action":"backsmali","dexpath":"*****"}'`
 
- Dump memory

`am broadcast -a hey.girl --ei target [pid] --es cmd '{"action":"dump_mem","start":1234567,"length":123}'`
 
- Dump stack trace information.                                                                                                                                                              
`am broadcast -a hey.girl --ei target [pid] --es cmd '{"action":"dump_heap"}'`
 
- Run Lua script.

`am broadcast -a hey.girl --ei target [pid] --es cmd '{"action":"invoke","filepath":"****"}'`
