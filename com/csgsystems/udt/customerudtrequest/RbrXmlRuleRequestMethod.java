/*
 * Generated code DO NOT EDIT
 * Generated file: RbrXmlRuleRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrXmlRuleRequestMethod implements UdtMethod {
  private String method = null;
  private RbrXmlRuleRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrXmlRuleCreate method */
  public static final RbrXmlRuleRequestMethod RBR_XML_RULE_CREATE = new RbrXmlRuleRequestMethod("RbrXmlRuleCreate");
  /** Variable representing the RbrXmlRuleDelete method */
  public static final RbrXmlRuleRequestMethod RBR_XML_RULE_DELETE = new RbrXmlRuleRequestMethod("RbrXmlRuleDelete");
  /** Variable representing the RbrXmlRuleFind method */
  public static final RbrXmlRuleRequestMethod RBR_XML_RULE_FIND = new RbrXmlRuleRequestMethod("RbrXmlRuleFind");
  /** Variable representing the RbrXmlRuleGet method */
  public static final RbrXmlRuleRequestMethod RBR_XML_RULE_GET = new RbrXmlRuleRequestMethod("RbrXmlRuleGet");
  /** Variable representing the RbrXmlRuleUpdate method */
  public static final RbrXmlRuleRequestMethod RBR_XML_RULE_UPDATE = new RbrXmlRuleRequestMethod("RbrXmlRuleUpdate");
}
