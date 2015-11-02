
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface DocumentTypeRefInterface extends BaliInterface {

  /**
   * Get Document Type Ref that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DocTypeRefFindIn Input Object Key.
   * @return DocumentTypeRefObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DocumentTypeRefObjectData dtTypeRefGet (DocumentTypeRefObjectKeyData DocTypeRefFindIn) throws BSDMResourceException;
  /**
   * Get Document Type Ref that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DocTypeRefFindIn Input Object Key.
   * @return DocumentTypeRefObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DocumentTypeRefObjectData dtTypeRefGet (BSDMSessionContext context, DocumentTypeRefObjectKeyData DocTypeRefFindIn) throws BSDMResourceException;


  /**
   * Get Document Type Ref that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DocTypeRefFindIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DocumentTypeRefObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DocumentTypeRefObjectData dtTypeRefGet (DocumentTypeRefObjectKeyData DocTypeRefFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Document Type Ref that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DocTypeRefFindIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DocumentTypeRefObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DocumentTypeRefObjectData dtTypeRefGet (BSDMSessionContext context, DocumentTypeRefObjectKeyData DocTypeRefFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
