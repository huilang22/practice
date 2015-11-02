/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementViewCancelBulkUdtTemplateItem.java
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
 * Class used to create a InvElementViewCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementViewCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjKeyData InvViewCancelIn;
/**
 *
 * Constructor to create a  InvElementViewCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementViewCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjKeyData InvViewCancelInIn) {
    super(id, context, "InvElementViewCancel");
    InvViewCancelIn = InvViewCancelInIn;
  }

  public void translateToMap() {
    if (InvViewCancelIn != null) {
      InvViewCancelIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjKeyHelper.toMap(InvViewCancelIn, new HashMap(), "InvElementObjKeyData").get("InvElementObjKeyData"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvViewCancelInIn Value of the InvViewCancelIn
 *
 */

  public void setInvElement(InvElementObjKeyData InvViewCancelInIn) {
    InvViewCancelIn = InvViewCancelInIn;
  }

  public void translateFromMap() {
    InvViewCancelIn = InvElementObjKeyHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjKeyData getInvElement( ) {
    return InvViewCancelIn;
  }

}
