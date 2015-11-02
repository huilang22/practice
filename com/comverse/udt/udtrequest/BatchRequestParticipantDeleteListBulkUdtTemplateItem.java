/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDeleteListBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * Class used to create a BatchRequestParticipantDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantObjectBaseFilter batchRequestParticipantDeleteListIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectBaseFilter batchRequestParticipantDeleteListInIn) {
    super(id, context, "BatchRequestParticipantDeleteList");
    batchRequestParticipantDeleteListIn = batchRequestParticipantDeleteListInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDeleteListIn != null) {
      Integer index =  batchRequestParticipantDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(batchRequestParticipantDeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipant
 * @param batchRequestParticipantDeleteListInIn Value of the batchRequestParticipantDeleteListIn
 *
 */

  public void setBatchRequestParticipant(BatchRequestParticipantObjectBaseFilter batchRequestParticipantDeleteListInIn) {
    batchRequestParticipantDeleteListIn = batchRequestParticipantDeleteListInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDeleteListIn = BatchRequestParticipantObjectBaseHelper.fromMapFilter(inputMap, "BatchRequestParticipant");
  }

/**
 *
 * Gets the BatchRequestParticipant
 * @return Value of the BatchRequestParticipant
 *
 */

  public BatchRequestParticipantObjectBaseFilter getBatchRequestParticipant( ) {
    return batchRequestParticipantDeleteListIn;
  }

}
