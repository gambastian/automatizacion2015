<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Families2Persons"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchMember2Person():V"/>
		<constant value="__exec__"/>
		<constant value="Member2Person"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyMember2Person(NTransientLink;):V"/>
		<constant value="Father2Man"/>
		<constant value="A.__applyFather2Man(NTransientLink;):V"/>
		<constant value="Mother2Woman"/>
		<constant value="A.__applyMother2Woman(NTransientLink;):V"/>
		<constant value="Son2Man"/>
		<constant value="A.__applySon2Man(NTransientLink;):V"/>
		<constant value="Daughter2Woman"/>
		<constant value="A.__applyDaughter2Woman(NTransientLink;):V"/>
		<constant value="__matchMember2Person"/>
		<constant value="Member"/>
		<constant value="Families"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="Father"/>
		<constant value="B.not():B"/>
		<constant value="35"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="Man"/>
		<constant value="Persons"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="119"/>
		<constant value="Mother"/>
		<constant value="63"/>
		<constant value="Woman"/>
		<constant value="Son"/>
		<constant value="91"/>
		<constant value="Daughter"/>
		<constant value="21:3-21:18"/>
		<constant value="28:3-28:20"/>
		<constant value="35:3-35:18"/>
		<constant value="42:3-42:20"/>
		<constant value="__applyFather2Man"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="firstName"/>
		<constant value=" "/>
		<constant value="J.+(J):J"/>
		<constant value="family"/>
		<constant value="lastName"/>
		<constant value="fullName"/>
		<constant value="13:16-13:17"/>
		<constant value="13:16-13:27"/>
		<constant value="13:30-13:33"/>
		<constant value="13:16-13:33"/>
		<constant value="13:36-13:37"/>
		<constant value="13:36-13:44"/>
		<constant value="13:36-13:53"/>
		<constant value="13:16-13:53"/>
		<constant value="13:4-13:53"/>
		<constant value="link"/>
		<constant value="__applyMother2Woman"/>
		<constant value="__applySon2Man"/>
		<constant value="__applyDaughter2Woman"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="46"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="50"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="51"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="52"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="1" name="33" begin="45" end="48"/>
			<lve slot="0" name="17" begin="0" end="49"/>
		</localvariabletable>
	</operation>
	<operation name="53">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="54"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<push arg="58"/>
			<push arg="55"/>
			<findme/>
			<call arg="20"/>
			<call arg="59"/>
			<if arg="60"/>
			<getasm/>
			<get arg="1"/>
			<push arg="61"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<load arg="19"/>
			<pcall arg="64"/>
			<dup/>
			<push arg="65"/>
			<push arg="66"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<goto arg="70"/>
			<load arg="19"/>
			<push arg="71"/>
			<push arg="55"/>
			<findme/>
			<call arg="20"/>
			<call arg="59"/>
			<if arg="72"/>
			<getasm/>
			<get arg="1"/>
			<push arg="61"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<load arg="19"/>
			<pcall arg="64"/>
			<dup/>
			<push arg="65"/>
			<push arg="73"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<goto arg="70"/>
			<load arg="19"/>
			<push arg="74"/>
			<push arg="55"/>
			<findme/>
			<call arg="20"/>
			<call arg="59"/>
			<if arg="75"/>
			<getasm/>
			<get arg="1"/>
			<push arg="61"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<load arg="19"/>
			<pcall arg="64"/>
			<dup/>
			<push arg="65"/>
			<push arg="66"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<goto arg="70"/>
			<load arg="19"/>
			<push arg="76"/>
			<push arg="55"/>
			<findme/>
			<call arg="20"/>
			<call arg="59"/>
			<if arg="70"/>
			<getasm/>
			<get arg="1"/>
			<push arg="61"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="51"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<load arg="19"/>
			<pcall arg="64"/>
			<dup/>
			<push arg="65"/>
			<push arg="73"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<goto arg="70"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="77" begin="26" end="31"/>
			<lne id="78" begin="54" end="59"/>
			<lne id="79" begin="82" end="87"/>
			<lne id="80" begin="110" end="115"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="63" begin="6" end="118"/>
			<lve slot="0" name="17" begin="0" end="119"/>
		</localvariabletable>
	</operation>
	<operation name="81">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="82"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="83"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="65"/>
			<call arg="84"/>
			<store arg="85"/>
			<load arg="85"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="86"/>
			<push arg="87"/>
			<call arg="88"/>
			<load arg="29"/>
			<get arg="89"/>
			<get arg="90"/>
			<call arg="88"/>
			<call arg="30"/>
			<set arg="91"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="92" begin="11" end="11"/>
			<lne id="93" begin="11" end="12"/>
			<lne id="94" begin="13" end="13"/>
			<lne id="95" begin="11" end="14"/>
			<lne id="96" begin="15" end="15"/>
			<lne id="97" begin="15" end="16"/>
			<lne id="98" begin="15" end="17"/>
			<lne id="99" begin="11" end="18"/>
			<lne id="100" begin="9" end="20"/>
			<lne id="77" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="65" begin="7" end="21"/>
			<lve slot="2" name="63" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="101" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="102">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="82"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="83"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="65"/>
			<call arg="84"/>
			<store arg="85"/>
			<load arg="85"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="86"/>
			<push arg="87"/>
			<call arg="88"/>
			<load arg="29"/>
			<get arg="89"/>
			<get arg="90"/>
			<call arg="88"/>
			<call arg="30"/>
			<set arg="91"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="92" begin="11" end="11"/>
			<lne id="93" begin="11" end="12"/>
			<lne id="94" begin="13" end="13"/>
			<lne id="95" begin="11" end="14"/>
			<lne id="96" begin="15" end="15"/>
			<lne id="97" begin="15" end="16"/>
			<lne id="98" begin="15" end="17"/>
			<lne id="99" begin="11" end="18"/>
			<lne id="100" begin="9" end="20"/>
			<lne id="78" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="65" begin="7" end="21"/>
			<lve slot="2" name="63" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="101" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="103">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="82"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="83"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="65"/>
			<call arg="84"/>
			<store arg="85"/>
			<load arg="85"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="86"/>
			<push arg="87"/>
			<call arg="88"/>
			<load arg="29"/>
			<get arg="89"/>
			<get arg="90"/>
			<call arg="88"/>
			<call arg="30"/>
			<set arg="91"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="92" begin="11" end="11"/>
			<lne id="93" begin="11" end="12"/>
			<lne id="94" begin="13" end="13"/>
			<lne id="95" begin="11" end="14"/>
			<lne id="96" begin="15" end="15"/>
			<lne id="97" begin="15" end="16"/>
			<lne id="98" begin="15" end="17"/>
			<lne id="99" begin="11" end="18"/>
			<lne id="100" begin="9" end="20"/>
			<lne id="79" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="65" begin="7" end="21"/>
			<lve slot="2" name="63" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="101" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="104">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="82"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="83"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="65"/>
			<call arg="84"/>
			<store arg="85"/>
			<load arg="85"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="86"/>
			<push arg="87"/>
			<call arg="88"/>
			<load arg="29"/>
			<get arg="89"/>
			<get arg="90"/>
			<call arg="88"/>
			<call arg="30"/>
			<set arg="91"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="92" begin="11" end="11"/>
			<lne id="93" begin="11" end="12"/>
			<lne id="94" begin="13" end="13"/>
			<lne id="95" begin="11" end="14"/>
			<lne id="96" begin="15" end="15"/>
			<lne id="97" begin="15" end="16"/>
			<lne id="98" begin="15" end="17"/>
			<lne id="99" begin="11" end="18"/>
			<lne id="100" begin="9" end="20"/>
			<lne id="80" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="65" begin="7" end="21"/>
			<lve slot="2" name="63" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="101" begin="0" end="21"/>
		</localvariabletable>
	</operation>
</asm>
