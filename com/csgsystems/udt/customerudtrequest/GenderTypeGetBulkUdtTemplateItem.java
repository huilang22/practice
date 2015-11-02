/*
 * Generated code DO NOT EDIT
 * Generated file: GenderTypeGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GenderTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GenderTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GenderTypeObjectKeyData GGetIn;
/**
 *
 * Constructor to create a  GenderTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenderTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GenderTypeObjectKeyData GGetInIn) {
    super(id, context, "GenderTypeGet");
    GGetIn = GGetInIn;
  }

  public void translateToMap() {
    if (GGetIn != null) {
      GGetIn.resetFlags(true, true);
      addInput("GenderType", GenderTypeObjectKeyHelper.toMap(GGetIn, new HashMap(), "GenderTypeObjectKeyData").get("GenderTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the GenderType
 * @param GGetInIn Value of the GGetIn
 *
 */

  public void setGenderType(GenderTypeObjectKeyData GGetInIn) {
    GGetIn = GGetInIn;
  }

  public void translateFromMap() {
    GGetIn = GenderTypeObjectKeyHelper.fromMap(inputMap, "GenderType");
  }

/**
 *
 * Gets the GenderType
 * @return Value of the GenderType
 *
 */

  public GenderTypeObjectKeyData getGenderType( ) {
    return GGetIn;
  }

}
