/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementPlusContFindBulkUdtTemplateItem.java
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
 * Class used to create a InvElementPlusContFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementPlusContFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementPlusObjData InvContFindIn;
/**
 *
 * Constructor to create a  InvElementPlusContFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementPlusContFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementPlusObjData InvContFindInIn) {
    super(id, context, "InvElementPlusContFind");
    InvContFindIn = InvContFindInIn;
  }

  public void translateToMap() {
    if (InvContFindIn != null) {
      InvContFindIn.resetFlags(true, true);
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(InvContFindIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }


/**
 *
 * Sets the InvElementPlus
 * @param InvContFindInIn Value of the InvContFindIn
 *
 */

  public void setInvElementPlus(InvElementPlusObjData InvContFindInIn) {
    InvContFindIn = InvContFindInIn;
  }

  public void translateFromMap() {
    InvContFindIn = InvElementPlusObjHelper.fromMap(inputMap, "InvElementPlus");
  }

/**
 *
 * Gets the InvElementPlus
 * @return Value of the InvElementPlus
 *
 */

  public InvElementPlusObjData getInvElementPlus( ) {
    return InvContFindIn;
  }

}
