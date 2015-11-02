/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapBestMatchBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapBestMatchBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapBestMatchBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectData OIIMBestIn;
/**
 *
 * Constructor to create a  OpenItemIdMapBestMatchBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapBestMatchBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectData OIIMBestInIn) {
    super(id, context, "OpenItemIdMapBestMatch");
    OIIMBestIn = OIIMBestInIn;
  }

  public void translateToMap() {
    if (OIIMBestIn != null) {
      OIIMBestIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMBestIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OIIMBestInIn Value of the OIIMBestIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectData OIIMBestInIn) {
    OIIMBestIn = OIIMBestInIn;
  }

  public void translateFromMap() {
    OIIMBestIn = OpenItemIdMapObjectHelper.fromMap(inputMap, "OpenItemIdMap");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectData getOpenItemIdMap( ) {
    return OIIMBestIn;
  }

}
