/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a InvElementExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvEDFindIn;
/**
 *
 * Constructor to create a  InvElementExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvEDFindInIn) {
    super(id, context, "InvElementExtendedDataFind");
    InvEDFindIn = InvEDFindInIn;
  }

  public void translateToMap() {
    if (InvEDFindIn != null) {
      InvEDFindIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvEDFindIn, new HashMap(), "InvElementExtendedData").get("InvElementExtendedData"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvEDFindInIn Value of the InvEDFindIn
 *
 */

  public void setInvElement(InvElementObjData InvEDFindInIn) {
    InvEDFindIn = InvEDFindInIn;
  }

  public void translateFromMap() {
    InvEDFindIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvEDFindIn;
  }

}
