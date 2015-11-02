/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapGetBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectKeyData OIIMGetIn;
/**
 *
 * Constructor to create a  OpenItemIdMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectKeyData OIIMGetInIn) {
    super(id, context, "OpenItemIdMapGet");
    OIIMGetIn = OIIMGetInIn;
  }

  public void translateToMap() {
    if (OIIMGetIn != null) {
      OIIMGetIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectKeyHelper.toMap(OIIMGetIn, new HashMap(), "OpenItemIdMapObjectKeyData").get("OpenItemIdMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OIIMGetInIn Value of the OIIMGetIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectKeyData OIIMGetInIn) {
    OIIMGetIn = OIIMGetInIn;
  }

  public void translateFromMap() {
    OIIMGetIn = OpenItemIdMapObjectKeyHelper.fromMap(inputMap, "OpenItemIdMap");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectKeyData getOpenItemIdMap( ) {
    return OIIMGetIn;
  }

}
