/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypePriceLookupMapGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a InvsTypePriceLookupMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypePriceLookupMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypePriceLookupMapObjectKeyData ITPLMGetIn;
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypePriceLookupMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypePriceLookupMapObjectKeyData ITPLMGetInIn) {
    super(id, context, "InvsTypePriceLookupMapGet");
    ITPLMGetIn = ITPLMGetInIn;
  }

  public void translateToMap() {
    if (ITPLMGetIn != null) {
      ITPLMGetIn.resetFlags(true, true);
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectKeyHelper.toMap(ITPLMGetIn, new HashMap(), "InvsTypePriceLookupMapObjectKeyData").get("InvsTypePriceLookupMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsTypePriceLookupMap
 * @param ITPLMGetInIn Value of the ITPLMGetIn
 *
 */

  public void setInvsTypePriceLookupMap(InvsTypePriceLookupMapObjectKeyData ITPLMGetInIn) {
    ITPLMGetIn = ITPLMGetInIn;
  }

  public void translateFromMap() {
    ITPLMGetIn = InvsTypePriceLookupMapObjectKeyHelper.fromMap(inputMap, "InvsTypePriceLookupMap");
  }

/**
 *
 * Gets the InvsTypePriceLookupMap
 * @return Value of the InvsTypePriceLookupMap
 *
 */

  public InvsTypePriceLookupMapObjectKeyData getInvsTypePriceLookupMap( ) {
    return ITPLMGetIn;
  }

}
