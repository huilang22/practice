/*
 * Generated code DO NOT EDIT
 * Generated file: AsyncRequestCreateBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a AsyncRequestCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AsyncRequestCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AsyncRequestObjectData AsyncRequestCreateIn;
/**
 *
 * Constructor to create a  AsyncRequestCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AsyncRequestCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AsyncRequestObjectData AsyncRequestCreateInIn) {
    super(id, context, "AsyncRequestCreate");
    AsyncRequestCreateIn = AsyncRequestCreateInIn;
  }

  public void translateToMap() {
    if (AsyncRequestCreateIn != null) {
      AsyncRequestCreateIn.resetFlags(true, true);
      addInput("AsyncRequest", AsyncRequestObjectHelper.toMap(AsyncRequestCreateIn, new HashMap(), "BatchId").get("BatchId"));
    }
  }


/**
 *
 * Sets the AsyncRequest
 * @param AsyncRequestCreateInIn Value of the AsyncRequestCreateIn
 *
 */

  public void setAsyncRequest(AsyncRequestObjectData AsyncRequestCreateInIn) {
    AsyncRequestCreateIn = AsyncRequestCreateInIn;
  }

  public void translateFromMap() {
    AsyncRequestCreateIn = AsyncRequestObjectHelper.fromMap(inputMap, "AsyncRequest");
  }

/**
 *
 * Gets the AsyncRequest
 * @return Value of the AsyncRequest
 *
 */

  public AsyncRequestObjectData getAsyncRequest( ) {
    return AsyncRequestCreateIn;
  }

}
