
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
public interface HqGroupsInterface extends BaliInterface {

  /**
   *  Creates a new Hq Group .
   * Convenience method using default BSDMSessionContext.
   * @param hgcIn Input  Object.  Read-Only fields: GroupId.  Defaulted Fields: ChgDt, ChgWho.  Derived Fields: GroupId.
   * @param AccountExternalId (null is allowed).
   * @param AccountExternalIdType (null is allowed).
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectData create (HqGroupsObjectData hgcIn, String AccountExternalId, Integer AccountExternalIdType) throws BSDMResourceException;
  /**
   *  Creates a new Hq Group .
   * @param context The session context to use when connecting to the APITS server.
   * @param hgcIn Input  Object.  Read-Only fields: GroupId.  Defaulted Fields: ChgDt, ChgWho.  Derived Fields: GroupId.
   * @param AccountExternalId (null is allowed).
   * @param AccountExternalIdType (null is allowed).
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectData create (BSDMSessionContext context, HqGroupsObjectData hgcIn, String AccountExternalId, Integer AccountExternalIdType) throws BSDMResourceException;


  /**
   *  Creates a new Hq Group .
   * Convenience method using default BSDMSessionContext.
   * @param hgcIn Input  Object.  Read-Only fields: GroupId.  Defaulted Fields: ChgDt, ChgWho.  Derived Fields: GroupId.
   * @param AccountExternalId (null is allowed).
   * @param AccountExternalIdType (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupsObjectData create (HqGroupsObjectData hgcIn, String AccountExternalId, Integer AccountExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   *  Creates a new Hq Group .
   * @param context The session context to use when connecting to the APITS server.
   * @param hgcIn Input  Object.  Read-Only fields: GroupId.  Defaulted Fields: ChgDt, ChgWho.  Derived Fields: GroupId.
   * @param AccountExternalId (null is allowed).
   * @param AccountExternalIdType (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupsObjectData create (BSDMSessionContext context, HqGroupsObjectData hgcIn, String AccountExternalId, Integer AccountExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields in an group.    .
   * Convenience method using default BSDMSessionContext.
   * @param hguIn Input  Object.  Defaulted Fields: ChgDt, ChgWho.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectData update (HqGroupsObjectData hguIn) throws BSDMResourceException;
  /**
   * Update non-key fields in an group.    .
   * @param context The session context to use when connecting to the APITS server.
   * @param hguIn Input  Object.  Defaulted Fields: ChgDt, ChgWho.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectData update (BSDMSessionContext context, HqGroupsObjectData hguIn) throws BSDMResourceException;


  /**
   * Update non-key fields in an group.    .
   * Convenience method using default BSDMSessionContext.
   * @param hguIn Input  Object.  Defaulted Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupsObjectData update (HqGroupsObjectData hguIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields in an group.    .
   * @param context The session context to use when connecting to the APITS server.
   * @param hguIn Input  Object.  Defaulted Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupsObjectData update (BSDMSessionContext context, HqGroupsObjectData hguIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds Groups based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param hgfIn Input Filter Object.
   * @return HqGroupsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectDataList find (HqGroupsObjectFilter hgfIn) throws BSDMResourceException;
  /**
   * Finds Groups based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgfIn Input Filter Object.
   * @return HqGroupsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectDataList find (BSDMSessionContext context, HqGroupsObjectFilter hgfIn) throws BSDMResourceException;


  /**
   * Finds Groups based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param hgfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupsObjectDataList find (HqGroupsObjectFilter hgfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds Groups based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupsObjectDataList find (BSDMSessionContext context, HqGroupsObjectFilter hgfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieves a Group object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param hggIn Input  Object.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectData get (HqGroupsObjectData hggIn) throws BSDMResourceException;
  /**
   * Retrieves a Group object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param hggIn Input  Object.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectData get (BSDMSessionContext context, HqGroupsObjectData hggIn) throws BSDMResourceException;


  /**
   * Retrieves a Group object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param hggIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupsObjectData get (HqGroupsObjectData hggIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieves a Group object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param hggIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupsObjectData get (BSDMSessionContext context, HqGroupsObjectData hggIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease a Group..
   * Convenience method using default BSDMSessionContext.
   * @param hgxIn Input  Object.  Defaulted Fields: InactiveDt, ChgDt, ChgWho.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectData delete (HqGroupsObjectData hgxIn) throws BSDMResourceException;
  /**
   * Cease a Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgxIn Input  Object.  Defaulted Fields: InactiveDt, ChgDt, ChgWho.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupsObjectData delete (BSDMSessionContext context, HqGroupsObjectData hgxIn) throws BSDMResourceException;


  /**
   * Cease a Group..
   * Convenience method using default BSDMSessionContext.
   * @param hgxIn Input  Object.  Defaulted Fields: InactiveDt, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupsObjectData delete (HqGroupsObjectData hgxIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease a Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgxIn Input  Object.  Defaulted Fields: InactiveDt, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupsObjectData delete (BSDMSessionContext context, HqGroupsObjectData hgxIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease groups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param hgxlFilter Input Filter Object.
   * @param HGInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (HqGroupsObjectFilter hgxlFilter, Date HGInactiveDate) throws BSDMResourceException;
  /**
   * Cease groups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgxlFilter Input Filter Object.
   * @param HGInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, HqGroupsObjectFilter hgxlFilter, Date HGInactiveDate) throws BSDMResourceException;


  /**
   * Cease groups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param hgxlFilter Input Filter Object.
   * @param HGInactiveDate (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (HqGroupsObjectFilter hgxlFilter, Date HGInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease groups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgxlFilter Input Filter Object.
   * @param HGInactiveDate (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, HqGroupsObjectFilter hgxlFilter, Date HGInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
