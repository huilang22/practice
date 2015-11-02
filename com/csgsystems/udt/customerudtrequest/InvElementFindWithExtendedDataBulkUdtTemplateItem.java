/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementFindWithExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a InvElementFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvFndWithIn;
/**
 *
 * Constructor to create a  InvElementFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvFndWithInIn) {
    super(id, context, "InvElementFindWithExtendedData");
    InvFndWithIn = InvFndWithInIn;
  }

  public void translateToMap() {
    if (InvFndWithIn != null) {
      Integer index =  InvFndWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvFndWithIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvFndWithInIn Value of the InvFndWithIn
 *
 */

  public void setInvElement(InvElementObjFilter InvFndWithInIn) {
    InvFndWithIn = InvFndWithInIn;
  }

  public void translateFromMap() {
    InvFndWithIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvFndWithIn;
  }

}
