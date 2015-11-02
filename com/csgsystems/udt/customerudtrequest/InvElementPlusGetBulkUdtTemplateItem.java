/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementPlusGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a InvElementPlusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementPlusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementPlusObjKeyData InvGetIn;
/**
 *
 * Constructor to create a  InvElementPlusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementPlusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementPlusObjKeyData InvGetInIn) {
    super(id, context, "InvElementPlusGet");
    InvGetIn = InvGetInIn;
  }

  public void translateToMap() {
    if (InvGetIn != null) {
      InvGetIn.resetFlags(true, true);
      addInput("InvElementPlus", InvElementPlusObjKeyHelper.toMap(InvGetIn, new HashMap(), "InvElementPlusObjKeyData").get("InvElementPlusObjKeyData"));
    }
  }


/**
 *
 * Sets the InvElementPlus
 * @param InvGetInIn Value of the InvGetIn
 *
 */

  public void setInvElementPlus(InvElementPlusObjKeyData InvGetInIn) {
    InvGetIn = InvGetInIn;
  }

  public void translateFromMap() {
    InvGetIn = InvElementPlusObjKeyHelper.fromMap(inputMap, "InvElementPlus");
  }

/**
 *
 * Gets the InvElementPlus
 * @return Value of the InvElementPlus
 *
 */

  public InvElementPlusObjKeyData getInvElementPlus( ) {
    return InvGetIn;
  }

}
