/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityFindBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvSecurityFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSecurityFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSecurityObjectFilter InvSecFindIn;
/**
 *
 * Constructor to create a  InvSecurityFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSecurityFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSecurityObjectFilter InvSecFindInIn) {
    super(id, context, "InvSecurityFind");
    InvSecFindIn = InvSecFindInIn;
  }

  public void translateToMap() {
    if (InvSecFindIn != null) {
      Integer index =  InvSecFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(InvSecFindIn, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }


/**
 *
 * Sets the InvSecurity
 * @param InvSecFindInIn Value of the InvSecFindIn
 *
 */

  public void setInvSecurity(InvSecurityObjectFilter InvSecFindInIn) {
    InvSecFindIn = InvSecFindInIn;
  }

  public void translateFromMap() {
    InvSecFindIn = InvSecurityObjectHelper.fromMapFilter(inputMap, "InvSecurity");
  }

/**
 *
 * Gets the InvSecurity
 * @return Value of the InvSecurity
 *
 */

  public InvSecurityObjectFilter getInvSecurity( ) {
    return InvSecFindIn;
  }

}
