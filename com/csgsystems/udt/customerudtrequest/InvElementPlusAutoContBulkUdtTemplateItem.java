/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementPlusAutoContBulkUdtTemplateItem.java
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
 * Class used to create a InvElementPlusAutoContBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementPlusAutoContBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementPlusObjFilter InvAutoContIn;
/**
 *
 * Constructor to create a  InvElementPlusAutoContBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementPlusAutoContBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementPlusObjFilter InvAutoContInIn) {
    super(id, context, "InvElementPlusAutoCont");
    InvAutoContIn = InvAutoContInIn;
  }

  public void translateToMap() {
    if (InvAutoContIn != null) {
      Integer index =  InvAutoContIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(InvAutoContIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }


/**
 *
 * Sets the InvElementPlus
 * @param InvAutoContInIn Value of the InvAutoContIn
 *
 */

  public void setInvElementPlus(InvElementPlusObjFilter InvAutoContInIn) {
    InvAutoContIn = InvAutoContInIn;
  }

  public void translateFromMap() {
    InvAutoContIn = InvElementPlusObjHelper.fromMapFilter(inputMap, "InvElementPlus");
  }

/**
 *
 * Gets the InvElementPlus
 * @return Value of the InvElementPlus
 *
 */

  public InvElementPlusObjFilter getInvElementPlus( ) {
    return InvAutoContIn;
  }

}
