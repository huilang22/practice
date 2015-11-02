/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskSequenceGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitTaskSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskObjectBaseKeyData noOpIn;

/**
 *
 * Constructor to create a   CitTaskSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectBaseKeyData noOpInIn) {
    super(id, context, "CitTaskSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }
/**
 *
 * Sets the  CitTask
 * @param noOpInIn CitTaskObjectBaseKeyData to set
 *
 */
  public void setCitTask(CitTaskObjectBaseKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTask passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectBaseKeyData getCitTask() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskObjectBaseKeyHelper.fromMap(inputMap, "CitTask");
  }
}
