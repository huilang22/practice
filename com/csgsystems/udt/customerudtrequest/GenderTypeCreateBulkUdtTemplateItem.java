/*
 * Generated code DO NOT EDIT
 * Generated file: GenderTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a GenderTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GenderTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GenderTypeObjectData GCreateIn;
/**
 *
 * Constructor to create a  GenderTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenderTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GenderTypeObjectData GCreateInIn) {
    super(id, context, "GenderTypeCreate");
    GCreateIn = GCreateInIn;
  }

  public void translateToMap() {
    if (GCreateIn != null) {
      GCreateIn.resetFlags(true, true);
      addInput("GenderType", GenderTypeObjectHelper.toMap(GCreateIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }


/**
 *
 * Sets the GenderType
 * @param GCreateInIn Value of the GCreateIn
 *
 */

  public void setGenderType(GenderTypeObjectData GCreateInIn) {
    GCreateIn = GCreateInIn;
  }

  public void translateFromMap() {
    GCreateIn = GenderTypeObjectHelper.fromMap(inputMap, "GenderType");
  }

/**
 *
 * Gets the GenderType
 * @return Value of the GenderType
 *
 */

  public GenderTypeObjectData getGenderType( ) {
    return GCreateIn;
  }

}
