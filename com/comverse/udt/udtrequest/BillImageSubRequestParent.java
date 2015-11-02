/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImageSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillImage related UdtSubRequestParents
 *
 */
public abstract class BillImageSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceBillImageInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_BillImage_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on BillImageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillImageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillImageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillImageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a BillImagePageRequest sub request
 * @param subRequest BillImagePageRequest
 *
 */
    public void addBillImageBillImagePageSubRequest(BillImagePageRequest subRequest) {
      addSubRequest(subRequest, "BillImage_BillImagePage_Ref");
    }
/**
 *
 * Adds a BillImagePageRequest sub request
 * @param subRequest BillImagePageRequest
 *
 */
    public void addBillImageBillImagePageSubRequest(BillImagePageSubRequestParent subRequest) {
      addSubRequest(subRequest, "BillImage_BillImagePage_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addBillImageInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "BillImage_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addBillImageInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "BillImage_Invoice_Ref");
    }

/**
 *
 * Constructor for BillImageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillImageSubRequestParent(String id, String method) {
    super(id, "BillImage", method);
  }
}
