/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectData OIIMUpdateIn;
/**
 *
 * Constructor to create a  OpenItemIdMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectData OIIMUpdateInIn) {
    super(id, context, "OpenItemIdMapUpdate");
    OIIMUpdateIn = OIIMUpdateInIn;
  }

  public void translateToMap() {
    if (OIIMUpdateIn != null) {
      OIIMUpdateIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMUpdateIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OIIMUpdateInIn Value of the OIIMUpdateIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectData OIIMUpdateInIn) {
    OIIMUpdateIn = OIIMUpdateInIn;
  }

  public void translateFromMap() {
    OIIMUpdateIn = OpenItemIdMapObjectHelper.fromMap(inputMap, "OpenItemIdMap");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectData getOpenItemIdMap( ) {
    return OIIMUpdateIn;
  }

}
