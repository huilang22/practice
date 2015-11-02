/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeUpdateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a GenderTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GenderTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GenderTypeObjectData GUpdateIn;
/**
 *
 * Constructor to create a  GenderTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenderTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GenderTypeObjectData GUpdateInIn) {
    super(id, context, "GenderTypeUpdate");
    GUpdateIn = GUpdateInIn;
  }

  public void translateToMap() {
    if (GUpdateIn != null) {
      GUpdateIn.resetFlags(true, true);
      addInput("GenderType", GenderTypeObjectHelper.toMap(GUpdateIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }


/**
 *
 * Sets the GenderType
 * @param GUpdateInIn Value of the GUpdateIn
 *
 */

  public void setGenderType(GenderTypeObjectData GUpdateInIn) {
    GUpdateIn = GUpdateInIn;
  }

  public void translateFromMap() {
    GUpdateIn = GenderTypeObjectHelper.fromMap(inputMap, "GenderType");
  }

/**
 *
 * Gets the GenderType
 * @return Value of the GenderType
 *
 */

  public GenderTypeObjectData getGenderType( ) {
    return GUpdateIn;
  }

}
