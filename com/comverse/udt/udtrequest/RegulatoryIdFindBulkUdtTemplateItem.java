/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdFindBulkUdtTemplateItem.java
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
 * Class used to create a RegulatoryIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RegulatoryIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RegulatoryIdObjectFilter RIFindIn;
/**
 *
 * Constructor to create a  RegulatoryIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RegulatoryIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RegulatoryIdObjectFilter RIFindInIn) {
    super(id, context, "RegulatoryIdFind");
    RIFindIn = RIFindInIn;
  }

  public void translateToMap() {
    if (RIFindIn != null) {
      Integer index =  RIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(RIFindIn, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }


/**
 *
 * Sets the RegulatoryId
 * @param RIFindInIn Value of the RIFindIn
 *
 */

  public void setRegulatoryId(RegulatoryIdObjectFilter RIFindInIn) {
    RIFindIn = RIFindInIn;
  }

  public void translateFromMap() {
    RIFindIn = RegulatoryIdObjectHelper.fromMapFilter(inputMap, "RegulatoryId");
  }

/**
 *
 * Gets the RegulatoryId
 * @return Value of the RegulatoryId
 *
 */

  public RegulatoryIdObjectFilter getRegulatoryId( ) {
    return RIFindIn;
  }

}
