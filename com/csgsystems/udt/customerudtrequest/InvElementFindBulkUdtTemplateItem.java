/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementFindBulkUdtTemplateItem.java
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
 * Class used to create a InvElementFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvFndIn;
/**
 *
 * Constructor to create a  InvElementFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvFndInIn) {
    super(id, context, "InvElementFind");
    InvFndIn = InvFndInIn;
  }

  public void translateToMap() {
    if (InvFndIn != null) {
      Integer index =  InvFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvFndIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvFndInIn Value of the InvFndIn
 *
 */

  public void setInvElement(InvElementObjFilter InvFndInIn) {
    InvFndIn = InvFndInIn;
  }

  public void translateFromMap() {
    InvFndIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvFndIn;
  }

}
