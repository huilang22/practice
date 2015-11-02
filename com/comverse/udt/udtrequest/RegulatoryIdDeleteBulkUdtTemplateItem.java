/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RegulatoryIdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RegulatoryIdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RegulatoryIdObjectKeyData RIDeleteIn;
/**
 *
 * Constructor to create a  RegulatoryIdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RegulatoryIdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RegulatoryIdObjectKeyData RIDeleteInIn) {
    super(id, context, "RegulatoryIdDelete");
    RIDeleteIn = RIDeleteInIn;
  }

  public void translateToMap() {
    if (RIDeleteIn != null) {
      RIDeleteIn.resetFlags(true, true);
      addInput("RegulatoryId", RegulatoryIdObjectKeyHelper.toMap(RIDeleteIn, new HashMap(), "RegulatoryIdObjectKeyData").get("RegulatoryIdObjectKeyData"));
    }
  }


/**
 *
 * Sets the RegulatoryId
 * @param RIDeleteInIn Value of the RIDeleteIn
 *
 */

  public void setRegulatoryId(RegulatoryIdObjectKeyData RIDeleteInIn) {
    RIDeleteIn = RIDeleteInIn;
  }

  public void translateFromMap() {
    RIDeleteIn = RegulatoryIdObjectKeyHelper.fromMap(inputMap, "RegulatoryId");
  }

/**
 *
 * Gets the RegulatoryId
 * @return Value of the RegulatoryId
 *
 */

  public RegulatoryIdObjectKeyData getRegulatoryId( ) {
    return RIDeleteIn;
  }

}
