/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapFindBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectFilter OIIMFindIn;
/**
 *
 * Constructor to create a  OpenItemIdMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectFilter OIIMFindInIn) {
    super(id, context, "OpenItemIdMapFind");
    OIIMFindIn = OIIMFindInIn;
  }

  public void translateToMap() {
    if (OIIMFindIn != null) {
      Integer index =  OIIMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMFindIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OIIMFindInIn Value of the OIIMFindIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectFilter OIIMFindInIn) {
    OIIMFindIn = OIIMFindInIn;
  }

  public void translateFromMap() {
    OIIMFindIn = OpenItemIdMapObjectHelper.fromMapFilter(inputMap, "OpenItemIdMap");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectFilter getOpenItemIdMap( ) {
    return OIIMFindIn;
  }

}
