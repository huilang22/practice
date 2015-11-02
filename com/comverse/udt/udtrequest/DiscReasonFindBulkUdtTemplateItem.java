/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a DiscReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscReasonObjectFilter DRFindIn;
/**
 *
 * Constructor to create a  DiscReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscReasonObjectFilter DRFindInIn) {
    super(id, context, "DiscReasonFind");
    DRFindIn = DRFindInIn;
  }

  public void translateToMap() {
    if (DRFindIn != null) {
      Integer index =  DRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscReason", DiscReasonObjectHelper.toMap(DRFindIn, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }


/**
 *
 * Sets the DiscReason
 * @param DRFindInIn Value of the DRFindIn
 *
 */

  public void setDiscReason(DiscReasonObjectFilter DRFindInIn) {
    DRFindIn = DRFindInIn;
  }

  public void translateFromMap() {
    DRFindIn = DiscReasonObjectHelper.fromMapFilter(inputMap, "DiscReason");
  }

/**
 *
 * Gets the DiscReason
 * @return Value of the DiscReason
 *
 */

  public DiscReasonObjectFilter getDiscReason( ) {
    return DRFindIn;
  }

}
