/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionRetrieveNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionRetrieveNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantDefinitionRetrieveNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Object noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionRetrieveNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionRetrieveNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Object noOpInIn) {
    super(id, context, "BatchRequestParticipantDefinitionRetrieve");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("Participants", noOpIn);
    }
  }
/**
 *
 * Sets the  Participants
 * @param noOpInIn Object to set
 *
 */
  public void setParticipants(Object noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Participants passed into the constructor
 * @return Simulated response
 *
 */
  public Object getParticipants() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Object)inputMap.get("Participants");
  }
}
