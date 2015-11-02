/*
 * Generated code DO NOT EDIT
 * Generated file: GenderTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GenderTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GenderTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GenderTypeObjectKeyData GDeleteIn;
/**
 *
 * Constructor to create a  GenderTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenderTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GenderTypeObjectKeyData GDeleteInIn) {
    super(id, context, "GenderTypeDelete");
    GDeleteIn = GDeleteInIn;
  }

  public void translateToMap() {
    if (GDeleteIn != null) {
      GDeleteIn.resetFlags(true, true);
      addInput("GenderType", GenderTypeObjectKeyHelper.toMap(GDeleteIn, new HashMap(), "GenderTypeObjectKeyData").get("GenderTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the GenderType
 * @param GDeleteInIn Value of the GDeleteIn
 *
 */

  public void setGenderType(GenderTypeObjectKeyData GDeleteInIn) {
    GDeleteIn = GDeleteInIn;
  }

  public void translateFromMap() {
    GDeleteIn = GenderTypeObjectKeyHelper.fromMap(inputMap, "GenderType");
  }

/**
 *
 * Gets the GenderType
 * @return Value of the GenderType
 *
 */

  public GenderTypeObjectKeyData getGenderType( ) {
    return GDeleteIn;
  }

}
