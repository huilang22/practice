/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementPlusAutoBulkUdtTemplateItem.java
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
 * Class used to create a InvElementPlusAutoBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementPlusAutoBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementPlusObjFilter InvAutoIn;
/**
 *
 * Constructor to create a  InvElementPlusAutoBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementPlusAutoBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementPlusObjFilter InvAutoInIn) {
    super(id, context, "InvElementPlusAuto");
    InvAutoIn = InvAutoInIn;
  }

  public void translateToMap() {
    if (InvAutoIn != null) {
      Integer index =  InvAutoIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(InvAutoIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }


/**
 *
 * Sets the InvElementPlus
 * @param InvAutoInIn Value of the InvAutoIn
 *
 */

  public void setInvElementPlus(InvElementPlusObjFilter InvAutoInIn) {
    InvAutoIn = InvAutoInIn;
  }

  public void translateFromMap() {
    InvAutoIn = InvElementPlusObjHelper.fromMapFilter(inputMap, "InvElementPlus");
  }

/**
 *
 * Gets the InvElementPlus
 * @return Value of the InvElementPlus
 *
 */

  public InvElementPlusObjFilter getInvElementPlus( ) {
    return InvAutoIn;
  }

}
