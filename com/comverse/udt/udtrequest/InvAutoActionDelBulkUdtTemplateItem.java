/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionDelBulkUdtTemplateItem.java
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
 * Class used to create a InvAutoActionDelBulkUdtTemplateItem Bulk Template
 *
 */

public class InvAutoActionDelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvAutoActionObjFilter InvAutoActionDelIn;
/**
 *
 * Constructor to create a  InvAutoActionDelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvAutoActionDelBulkUdtTemplateItem(String id, BSDMSessionContext context, InvAutoActionObjFilter InvAutoActionDelInIn) {
    super(id, context, "InvAutoActionDel");
    InvAutoActionDelIn = InvAutoActionDelInIn;
  }

  public void translateToMap() {
    if (InvAutoActionDelIn != null) {
      Integer index =  InvAutoActionDelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvAutoAction", InvAutoActionObjHelper.toMap(InvAutoActionDelIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvAutoAction
 * @param InvAutoActionDelInIn Value of the InvAutoActionDelIn
 *
 */

  public void setInvAutoAction(InvAutoActionObjFilter InvAutoActionDelInIn) {
    InvAutoActionDelIn = InvAutoActionDelInIn;
  }

  public void translateFromMap() {
    InvAutoActionDelIn = InvAutoActionObjHelper.fromMapFilter(inputMap, "InvAutoAction");
  }

/**
 *
 * Gets the InvAutoAction
 * @return Value of the InvAutoAction
 *
 */

  public InvAutoActionObjFilter getInvAutoAction( ) {
    return InvAutoActionDelIn;
  }

}
