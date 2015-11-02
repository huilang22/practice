/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RegulatoryIdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RegulatoryIdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RegulatoryIdObjectData RIUpdateIn;
/**
 *
 * Constructor to create a  RegulatoryIdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RegulatoryIdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RegulatoryIdObjectData RIUpdateInIn) {
    super(id, context, "RegulatoryIdUpdate");
    RIUpdateIn = RIUpdateInIn;
  }

  public void translateToMap() {
    if (RIUpdateIn != null) {
      RIUpdateIn.resetFlags(true, true);
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(RIUpdateIn, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }


/**
 *
 * Sets the RegulatoryId
 * @param RIUpdateInIn Value of the RIUpdateIn
 *
 */

  public void setRegulatoryId(RegulatoryIdObjectData RIUpdateInIn) {
    RIUpdateIn = RIUpdateInIn;
  }

  public void translateFromMap() {
    RIUpdateIn = RegulatoryIdObjectHelper.fromMap(inputMap, "RegulatoryId");
  }

/**
 *
 * Gets the RegulatoryId
 * @return Value of the RegulatoryId
 *
 */

  public RegulatoryIdObjectData getRegulatoryId( ) {
    return RIUpdateIn;
  }

}
