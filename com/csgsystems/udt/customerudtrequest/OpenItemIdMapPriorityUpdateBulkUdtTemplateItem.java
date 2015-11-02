/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapPriorityUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapPriorityUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapPriorityUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectData OIIMPrioUpdIn;
/**
 *
 * Constructor to create a  OpenItemIdMapPriorityUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapPriorityUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectData OIIMPrioUpdInIn) {
    super(id, context, "OpenItemIdMapPriorityUpdate");
    OIIMPrioUpdIn = OIIMPrioUpdInIn;
  }

  public void translateToMap() {
    if (OIIMPrioUpdIn != null) {
      OIIMPrioUpdIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMPrioUpdIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OIIMPrioUpdInIn Value of the OIIMPrioUpdIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectData OIIMPrioUpdInIn) {
    OIIMPrioUpdIn = OIIMPrioUpdInIn;
  }

  public void translateFromMap() {
    OIIMPrioUpdIn = OpenItemIdMapObjectHelper.fromMap(inputMap, "OpenItemIdMap");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectData getOpenItemIdMap( ) {
    return OIIMPrioUpdIn;
  }

}
