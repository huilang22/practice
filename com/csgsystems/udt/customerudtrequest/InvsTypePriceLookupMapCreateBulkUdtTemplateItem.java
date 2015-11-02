/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypePriceLookupMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypePriceLookupMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypePriceLookupMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypePriceLookupMapObjectData ITPLMCreateIn;
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypePriceLookupMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypePriceLookupMapObjectData ITPLMCreateInIn) {
    super(id, context, "InvsTypePriceLookupMapCreate");
    ITPLMCreateIn = ITPLMCreateInIn;
  }

  public void translateToMap() {
    if (ITPLMCreateIn != null) {
      ITPLMCreateIn.resetFlags(true, true);
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(ITPLMCreateIn, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }


/**
 *
 * Sets the InvsTypePriceLookupMap
 * @param ITPLMCreateInIn Value of the ITPLMCreateIn
 *
 */

  public void setInvsTypePriceLookupMap(InvsTypePriceLookupMapObjectData ITPLMCreateInIn) {
    ITPLMCreateIn = ITPLMCreateInIn;
  }

  public void translateFromMap() {
    ITPLMCreateIn = InvsTypePriceLookupMapObjectHelper.fromMap(inputMap, "InvsTypePriceLookupMap");
  }

/**
 *
 * Gets the InvsTypePriceLookupMap
 * @return Value of the InvsTypePriceLookupMap
 *
 */

  public InvsTypePriceLookupMapObjectData getInvsTypePriceLookupMap( ) {
    return ITPLMCreateIn;
  }

}
