/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationDetailDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationDetailObjectKeyData ILDDeleteIn;
/**
 *
 * Constructor to create a  InvsLocationDetailDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailObjectKeyData ILDDeleteInIn) {
    super(id, context, "InvsLocationDetailDelete");
    ILDDeleteIn = ILDDeleteInIn;
  }

  public void translateToMap() {
    if (ILDDeleteIn != null) {
      ILDDeleteIn.resetFlags(true, true);
      addInput("InvsLocationDetail", InvsLocationDetailObjectKeyHelper.toMap(ILDDeleteIn, new HashMap(), "InvsLocationDetailObjectKeyData").get("InvsLocationDetailObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLocationDetail
 * @param ILDDeleteInIn Value of the ILDDeleteIn
 *
 */

  public void setInvsLocationDetail(InvsLocationDetailObjectKeyData ILDDeleteInIn) {
    ILDDeleteIn = ILDDeleteInIn;
  }

  public void translateFromMap() {
    ILDDeleteIn = InvsLocationDetailObjectKeyHelper.fromMap(inputMap, "InvsLocationDetail");
  }

/**
 *
 * Gets the InvsLocationDetail
 * @return Value of the InvsLocationDetail
 *
 */

  public InvsLocationDetailObjectKeyData getInvsLocationDetail( ) {
    return ILDDeleteIn;
  }

}
